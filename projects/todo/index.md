---
title: TODO App
parent: Projects
nav_order: 1
---

## Task

Write an application allows a user to manage TODOs (this is the classical beginner app ;) )

The following sections should help you to build your application step-by-step (i.e. start only with the next step after you completed the previous one)

### Step 1

When running your application, it should give the user two options:
- print all current TODOs
- add a new TODO (a new TODO is just a text with the description of what to do e.g. Buy milk, Clean the dishes)
- and of course the user should be able to exit the application

### Step 2

Extend the application from step 1.

Each TODO should now also have a status: OPEN or DONE

When a TODO is added, it should get the status OPEN.

Add new functionality:
- a user should be able to mark a TODO as DONE
- when printing the TODOs, show also the status
- extend showing TODOs such that the user can choose if he/she wants to see all TODOs, all open TODOs or all done TODOs

### Step 3

Extend the application from step 2.

Each TODO should now also get a priority (might be a number from 1 to 10) and a due date (e.g. 2020-12-09)

When adding a new TODO, the user should be able to set priority and due date.

Additionally, our application should
- print priority and due date when showing TODOs
- allow the user to change priority and due date of a TODO

### Step 4

Extend the application from step 3

When the user is prompted with what to do next, your application should also check if there is an open TODO where the due date was missed.
If yes, print that also as information for the user.

### Step 5

Extend the application from step 4

Give the user an additional option to ask for the next thing to do.

Thus your application should print the "most urgent one" which should depend on the due date and the priority.

Some rule might be (feel free to change that how you like):
- if there is something that needs to be done within next 3 days, this should be most urgent (i.e. if there are multiple ones, choose the one where is least time left)
- else decide depending on priority

### Step 6

If you made it to here:
think about how to change your application to manage the TODOs of multiple users!