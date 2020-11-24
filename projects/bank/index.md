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

Example:
```bash
Welcome to your bank account!
Your current balance is 0

Type
1 for Withdrawal
2 for Deposit
3 to quit
Your choice?
> 2
How much do you wanna deposit?
> 100
Your current balance is 100.

Type
1 for Withdrawal
2 for Deposit
3 to quit
Your choice?
> 1
How much do you wanna withdraw?
> 40
Your current balance is 60.
```

### Step 2

Extend the application from step 1.

Now, let's limit how much a user can withdraw from his account.

When the account is created, it should define a negative limit for the account.

E.g. if negative limit is 200, user should only be allowed to withdraw so that balance does not go under -200

Example:
```bash
Your current balance is 20

Type
1 for Withdrawal
2 for Deposit
3 to quit
Your choice?
> 1
How much do you wanna withdraw?
> 300
Not allowed, your negative limit is -200

```

### Step 3

Extend the application from step 2.

Protect the account with a password.

When a user now wants to deposit or withdraw, ask him for the password.

Only if the password is valid, he/she should be able to proceed.

Example:
```bash
Welcome to your bank account!
Your current balance is 0

Type
1 for Withdrawal
2 for Deposit
3 to quit
Your choice?
> 2
How much do you wanna deposit?
> 100
Enter password
> 123456
Your current balance is 100.

Type
1 for Withdrawal
2 for Deposit
3 to quit
Your choice?
> 1
How much do you wanna withdraw?
> 40
Enter password
> 123
Denied, password is wrong!
```

### Step 4

Extend the application from step 3

Let's support multiple accounts!

When a user interacts with your application, he/she
- should be able to create a new account
- or interact with his existing one (i.e. withdraw or deposit)

For account creation, user needs to give his name and choose a password (note: a user should only have 1 account)

For interacting with existing account, user needs to provide his name, so that right account can be found and used.

Example:
```bash
Welcome to your bank!

Type
1 to Create a new account
2 to Use your account
3 to quit
Your choice?
> 2
Enter your name:
> Nico
Welcome to your account, Nico.
Your current balance is 100.

Type
1 for Withdrawal
2 for Deposit
3 to quit
Your choice?
> 3
logging out

Welcome to your bank!

Type
1 to Create a new account
2 to Use your account
3 to quit
Your choice?
> 1
Enter your name:
> Diana
Choose a password:
> 123456

Welcome to your account, Diana.
Your current balance is 0.

Type
1 for Withdrawal
2 for Deposit
3 to quit
Your choice?
```

### Step 5

Extend the application from step 4

Now we want to add interests.

After 10 interactions with an account, the application should calculate an interest and adapt the balance accordingly:
- if the balance of the account is positive, add 1.5% to it
- if the balance of the account is negative, decrease by 4%

Examples:
- if the balance of account is 100, it should be increased to 101.5
- if the balance of account is -100, it should be decreased to -104

### Step 6

Implement transfers between accounts!

User should have additional option to transfer money to another customer!

Example
```bash
Your current balance is 100

Type
1 for Withdrawal
2 for Deposit
3 for Transfer
4 to quit
Your choice?
> 3
How much do you wanna transfer?
> 50
Transfer to whom?
> Nico
Enter password
> 123456
Your current balance is 50.

```

### Step 7

If you made it so far:

Protect your bank against money laundering!

A money laundering can be identified if
- there is an account A where money is directly deposited but never withdrawn
- money from account A is transferred to an account B only

(these are ofc quite easy rules ...)

Your application should check these rule on any money transfer and if these are true, print the violation!

