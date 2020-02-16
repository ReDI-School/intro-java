---
title: Quiz
parent: Projects
nav_order: 3
---

# Quiz

We want to implement a simple quiz.
Users are asked questions, give answer, and receive a score.

## What the game should do

The game asks users 10 questions.

The questions are defined by the author of the quiz game.

For each question, the author provides also one correct
answer and 2 wrong answers.

Each question is present to the user. Answers are identified
by letters and the user gives their answer by typing
the letter.

For each correct answer, the user receives 5 point.
For each wrong answer, the user loses 2 point.

At the end, the user receives the total points.

### Possible improvements

- Answers are presented in random order.
- Questions are presented in random order.
- Questions are randomly picked from a larger set.
- Users get a message based on the result
  - Excellent, if total score is above 45.
  - Good, if above 35 up to 45.
  - Satisfactory, if above 25 up to 35.
  - Poor, otherwise.
- Users may decide to skip questions by answering '0', losing 1 point.
  - A new question is given, so they still have to
    answers to 10 questions in total.
  - If there are no more unanswered questions because
    users skipped too many of them, older one are presented again.

## Design

The project is related to questions so it's probably a good idea to introduce
a class called `Question` that represents a question with all its properties.

Properties of a question could be:

- the question text, like _"what is the largest ocean on Earth?_
- the list of possible answers, like:
  - _"Atlantic"_
  - _"Pacific"_
  - _"Indian"_
  - _"Arctic"_
  - _"Southern"_
- the right answer, like _"Pacific"_

Writing the same answer twice as two different strings, one as possible answer
and one as correct answer, is not nice. There are better alternatives:

- Not including the right answers in the list, that would become then
  the list of wrong answers.
- Referencing the right answer by number, instead of as a copy of the text.

It's a good idea to define a method that return an `ArrayList<Question>`
containing all the possible questions and answers. So that it's possible to
change the text of the quiz without affecting the rest of the program,
or it's possible to define more than one of such methods, to have
different quiz on different subjects, without changing the code
of the program but simply using one set of questions instead of another one.

Once the list of questions is obtained, it can be shuffled
to ask the answers in a random order. The Java library method
`Collection.shuffle()` can do this for you.

We need an integer variable to store how many points the user gets.
Initially, the user starts with zero points.

The game is a loop over the possible questions, stored in the
`ArrayList<Question>` that was previously shuffled.

For each question:

- Ask the user for the answer
- Check if the answer is correct
- Update the points

Asking a question should present all the possible answers, each with a letter.
The first letter is 'a'. The second letter 'b', and so on. `char` works like
an integer, so `'a' + 1` is `'b'`, also `++` works.

It's a good idea to add a method to the class `Question` to print the question,
including the answers, and invoke the method from the main program.

Another method can be added to `Question` to verify if an answer
is the correct one. In this case, the method should accept a `char` parameter
and return `boolean`, to indicate if the answer is the correct one or not.

Updating the points does not belong to the `Question` class,
as this logic is related to the main program, the quiz, not to each question.
Updating the point can stay in the main function of the program, inside the loop.

Once all the questions are answered, the resulting points and the final
message is printed. It's good to introduce a method for this in the main program,
that takes an integer as parameter and prints the result and final message to the user.

### Skipping questions

Skipping questions requires reworking the program we designed so far.

We want to ask users questions and terminate the quiz once they have answered
N questions. Clearly, the list of possible questions should contain at least N questions
otherwise it's impossible to solve the game. This should be checked.

Only answered questions count again the N.

If users decide to skip a question, they're penalized in term of points
and a next question is presented. If users skip too many questions
the game can't terminate properly. It was decided, at the beginning of the project,
to present users with unanswered questions that were already skipped.

In case users skip too many questions, they will start seeing the same
questions over and over, until they answer. This is what the project should do.

_How to implement this?_

A possible solution could be the following algorithm:

- We start with the list of all the possible questions, the one shuffled at the beginning.
- We take the **first** question from the list, **removing it** from the list
- We ask users the question:
  - If they answer (correctly or not), we update the points and discard the question.
  - If they decide to skip, we **put back** the question at the **end** of the list.

In this way, skipping too much, users are presented with questions already seen and skipped.

Once users answer N question, the quiz terminate and the result is printed.
