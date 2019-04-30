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
- Questions are randomly picked from a larger pool.
- Users may decide to skip questions, losing 1 point.
  - A new question is given, so they still have to
    answers to 10 questions in total.
  - If there are no more unanswered questions because
    users skipped too many of them, older one are presented again. 
- Users get a message based on the result
  - Excellent, if total score is above 45.
  - Good, if above 35 up to 45.
  - Satisfactory, if above 25 up to 35.
  - Poor, otherwise.

## Design

To be defined.