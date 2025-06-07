# Rock-Paper-Scissors Game
import random

print("Welcome to Rock, Paper, Scissors!")

choices = ["rock", "paper", "scissors"]

while True:
    player_choice = input("Choose rock, paper, or scissors (or 'quit' to exit): ").lower()

    if player_choice == 'quit':
        print("Thanks for playing! Goodbye.")
        break

    if player_choice not in choices:
        print("Invalid choice. Please choose rock, paper, or scissors.")
        continue

    computer_choice = random.choice(choices)
    print(f"You chose: {player_choice}")
    print(f"Computer chose: {computer_choice}")

    if player_choice == computer_choice:
        print("It's a tie!")
    elif (player_choice == "rock" and computer_choice == "scissors") or \
         (player_choice == "paper" and computer_choice == "rock") or \
         (player_choice == "scissors" and computer_choice == "paper"):
        print("You win!")
    else:
        print("Computer wins!")