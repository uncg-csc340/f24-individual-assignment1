# CSC 340 Fall 2024 Individual Assignment 1
> First collaborative homework assignment.

This assignment is to make sure you are comfortable using Git. At the end, you will have created your own branch off of a main branch, made your own edits, pushed those edits back to the origin. \
You will have sent a pull request to have your changes merged with the main branch. Be sure to add your GitHub username to the assignment "Give Me Your Github Username" located on this Canvas course. If you have already given me your GitHub username, 
You will receive an invitation to participate in the project via email once I have added you as a collaborator to the GitHub repo. That's when you know you will have permission to push your changes to the GitHub server, otherwise your push will be rejected.

## Step One: In your OneDrive folder location, create a folder that will serve as a workspace for your CSC340 projects. 
> Give it an appropriate name, e.g. csc340-workspace.

## Step Two: Inside the workspace folder, right-click on an empty space and start a Git Bash terminal/Git GUI dialog. 
> MacOS users can just start a regular terminal.
> Do not go into any previously created repositories!

## Step Three: Clone this repository to your local machine.
    git clone https://github.com/uncg-csc340/f24-individual-assignment1.git

## Step Four: Change directory into the repository you just cloned. 
    cd f24-individual-assignment1
> Look for the blue text that says (main)/(master). This shows that you are in a git repository.

## Step Five: Create your own branch.
    git checkout -b [ BRANCH NAME ]
> where [ BRANCH NAME ] is your first initial and last name, e.g. John Doe would be jdoe, mine is sntini. No brackets!

## Step Six: Open the project folder in IntelliJ.
> Make your edits in the main class. Do not directly edit the about-me.txt file. Create a new User object with your own details following the examples. Add your new user to the list. 
>
> Run the main method, this will automatically write to the about-me.txt file. Save your changes.
> 
> Note: This file is public. Do not add any information that you would not want someone to read who might happen upon it.
>

## Step Seven: In GitBash, add the edited files to the staging area.
    git add Main.java about-me.txt
    
## Step Eight: In GitBash, commit your changes to the repository.
    git commit -m 'a short description of why you are making this commit'


Note you can do steps 7 and 8 in one click on IntelliJ. Under the "commit" tab, select the 2 files, type your commit message, and click the commit button.
## Step Nine: In GitBash, pull from the main branch into your branch.
>More edits may have been made to the document from other users in the time it took you to clone the file and update it.
>
>To resolve any potential conflicts and make sure your document is up-to-date, pull from Main again.

    git pull origin main

> Note, if there are any updates or merge conflicts that have to be resolved, Go to Step six. Edit the file and remove the extra text inserted by the merge conflict.
> 
> The file with conflicts will include two versions of the same lines. Each version will be labeled with branch names. When you resolve the conflicts, make sure you do
> not erase someone else's work in about-me.txt.
>
> After you save the file that had conflicts, you will need to make a new commit. Git will usually prompt you to do this.

## Step Ten: In GitBash, publish your branch to origin.
    git push origin [ BRANCH NAME ]
> If you have not been added as a collaborator to the repository, you will get an error from GitHub!

## Step Eleven: Log into GitHub, go to the repo, and create a Pull Request.
https://github.com/uncg-csc340/f24-individual-assignment1
> GitHub will probably prompt you to create a pull request by saying "Compare And Pull Request"
> 
> Make sure the compare branch is your own branch, and the base branch is main.

## Final Step: Submit a link to the pull request that you created.
> Open your pull request and just copy the URL in the address bar. The link will include the word "pull" and a number in it. Do not submit a link to the general repository.
> 
> Your work will get approved and merged so that your changes show up on the main branch.
