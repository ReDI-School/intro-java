  
  var totalCorrect = 0;

  var assessQuestionResult = function(selected, correct) {
    let result = {correct : [], wrong : [], missed : []};
    result.correct = selected.filter(sel => correct.some(cor => cor === sel));
    result.wrong = selected.filter(sel => correct.every(cor => cor !== sel));
    result.missed = correct.filter(cor => selected.every(sel => sel !== cor));
    return result;
  };

  var nextQuestion = function(quiz, prev, count) {
    var q = quiz.shift();
    var questionNodes = document.querySelectorAll(".question");
    var currentQuestionNode = questionNodes[q];
    var solutionNodes = document.querySelectorAll(".solution");
    var currentSolutionNode = solutionNodes[q];

    var answers = currentQuestionNode.querySelectorAll("li.answer input");
    answers.forEach(answerBox => {
     answerBox.disabled = false;
   });

   var btn = document.createElement("button");
   btn.innerHTML = 'Submit';

   btn.addEventListener('click', event => {
    var selectedAnswers = [];
    currentQuestionNode.querySelectorAll("li.answer input:checked")
      .forEach(answer => selectedAnswers.push(answer.nextSibling.textContent.trim()));
    var correctAnswers = [];
    currentQuestionNode.querySelectorAll("li.correct")
      .forEach(answer => correctAnswers.push(answer.textContent.trim()));
    
    var result = assessQuestionResult(selectedAnswers, correctAnswers);
    var resulttexts = [];
    var coranswersTxt = "Correct answers are " + result.correct.concat(result.missed).map(a => "'" + a + "'").join(" and ");
    if(result.wrong.length === 0 && result.missed.length === 0) {
      resulttexts.push("Well done, all correct!");
      totalCorrect++;
    } else if(result.wrong.length > 0) {
      resulttexts.push("Sorry, you got something wrong");
      resulttexts.push("Wrong answers are " + result.wrong.map(a => "'" + a + "'").join(" and "));
    } else {
      resulttexts.push("Quite close, but your answer is not complete");
      resulttexts.push("You forgot " + result.missed.length + " answers that are also correct")
    }
    resulttexts.push(coranswersTxt);

    var node = btn.parentNode;
    node.removeChild(btn);
    resulttexts.forEach(txt => {
      var pNode = document.createElement("p");
      pNode.innerHTML = txt;
      node.append(pNode);
    });

    currentSolutionNode.style.display='block';

    if(quiz.length === 0) {
      var resbtn = document.createElement("button");
      resbtn.innerHTML = 'Result';
      resbtn.addEventListener('click', event => {
        currentQuestionNode.style.display='none';
        currentSolutionNode.style.display='none';
        var pNode = document.createElement("p");
        pNode.innerHTML = "Your test result: you answered correctly " + totalCorrect + " of " + count + " questions";
        currentSolutionNode.parentNode.insertBefore(pNode,currentSolutionNode.nextSibling);
      });
      currentSolutionNode.append(resbtn);
      return;
    }
    var btn2 = document.createElement("button");
    btn2.innerHTML = 'Next';
    btn2.addEventListener('click', event => {
        nextQuestion(quiz, q, count);
    });
    currentSolutionNode.append(btn2);
   });

   currentQuestionNode.querySelector("ul.answers").append(btn);
   currentQuestionNode.style.display='block';
   if(prev !== null) {
     questionNodes[prev].style.display='none';
     solutionNodes[prev].style.display='none';
   }
  };

  var startQuiz = function(total_questions, quiz_questions) {
    var quiz = createQuestionsArray(total_questions, quiz_questions);
    
    nextQuestion(quiz, null, quiz_questions);
  };

  var shuffleArray = function (array) {
    var currentIndex = array.length;
    var temporaryValue, randomIndex;
    
    while (0 !== currentIndex) {
      randomIndex = Math.floor(Math.random() * currentIndex);
      currentIndex -= 1;
  
      temporaryValue = array[currentIndex];
      array[currentIndex] = array[randomIndex];
      array[randomIndex] = temporaryValue;
    }
    return array;
  };

  var createQuestionsArray = function(total_questions, quiz_questions) {
    var qArr = [];
    for(var i = 0; i < total_questions; i++) {
      qArr.push(i);
    }
    var shuffled = shuffleArray(qArr);
    if(quiz_questions >= total_questions) {
      return shuffled;
    } else {
      return shuffled.slice(0, quiz_questions);
    }
  };
