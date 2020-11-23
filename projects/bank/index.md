---
title: Bank Simulation
parent: Projects
nav_order: 2
---

## Task

Write an application that simulates a bank (i.e. bank accounts of users)

### Step 1

Start with a program simulating a bank account of a customer.

Account starts with a balance of zero.

The user has two options:
- he can withdraw money from account
- he can deposit money to account

After each such transaction, print current balance.

Program should run until user enters a quit command

### Step 2

Extend the application from step 1.

Now, let's limit how much a user can withdraw from his account.

When the account is created, it should define a negative limit for the account.

E.g. if negative limit is 200, user should only be allowed to withdraw so that balance does not go under -200

### Step 3

Extend the application from step 2.

Protect the account with a password.

When a user now wants to deposit or withdraw, ask him for the password.

Only if the password is valid, he/she should be able to proceed.

### Step 4

Extend the application from step 3

Let's support multiple accounts!

When a user interacts with your application, he/she
- should be able to create a new account
- or interact with his existing one (i.e. withdraw or deposit)

For account creation, user needs to give his name and choose a password (note: a user should only have 1 account)

For interacting with existing account, user needs to provide his name, so that right account can be found and used.

### Step 5

Extend the application from step 4

Now we want to add interests.

After 10 interactions with an account, the application should calculate an interest and adapt the balance accordingly:
- if the balance of the account is positive, add 1.5% to it
- if the balance of the account is negative, decrease by 4%

### Step 6

Implement transfers between accounts!

User should have additional option to transfer money to another customer!

### Step 7

If you made it so far:

Protect your bank against money laundering!

A money laundering can be identified if
- there is an account A where money is directly deposited but never withdrawn
- money from account A is transferred to an account B only

(these are ofc quite easy rules ...)

Your application should check these rule on any money transfer and if these are true, print the violation!

