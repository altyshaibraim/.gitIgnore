public class BranchInGit {
    public static void main(String[] args) {

    /*                         BRANCH IN GIT & GITHUB

             Branch in Git & GitHub is a unique set of code changes with a unique name. Timeline.
             Each repository has one default branch(master), and CAN have multiple other branches.
             The master(main) branch — the one where all changes eventually get merged back into.
             Never, ever push anything to master that is not tested, or that breaks the build. Because the master branch
                                            is deployable. It is your production code, ready to roll out into the world.

                               Why create other branches?
             To begin working on anything new in a project, or to change existing things, you create a branch
                                                                                           off the stable master branch.
                               Where is your head?
             The HEAD in Git is the pointer to the current branch reference, which is in turn a pointer to the last
             commit you made or the last commit that was checked out into your working directory.You can imagine HEAD
             as the “current committed branch”. When working with Git, only one branch can be checked out at a time.

                               To Create a New Branch on IntelliJ:
             on right bottom corner under 'Event Log' click 'Git: branch name' -> name -> Create

                               To navigate head from one branch to another (checkout):
             click Git: branch name(on the right bottom) -> choose a branch you need -> right click on chosen branch ->
                                                                                                           -> checkout
                               To merge 2 branches:
             click Git: branch name(on the right bottom) -> choose a branch you need to add changes TO-> checkout ->
             click Git: branch name(on the right bottom) -> choose a branch you need to add changes FROM -> right click
             -> Merge Into Current

             !!! Once sub-branch is merged with main, that sub-branch can be deleted

             Tag color: green - branch, yellow - head branch, purple - pushed to GHW.
             Full Yellow Star - main branch, Empty Yellow Star - derivative branch (sub-branch).

                                To push Local branch to Remote:
             VCS -> Git -> Push -> on msg screen make sure the branch is selected -> Push
             ON GHW: Compare & Pull Request -> name -> add description -> Create Pull Request -> Merge Pull Request ->
                                                                                                            -> Confirm
             ON IntelliJ: checkout the branch merged to -> Update Project -> OK
             !!! Compare —> Comparing the master branch to logout branch
             !!! Pull Request ->   Pull requests let you tell others about changes you've pushed to a GitHub repository.
                 Once a pull request is sent, interested parties can review the set of changes, discuss potential
                 modifications, and even push follow-up commits if necessary.

                                 To create 'Pull Request' from IntelliJ:
              VCS -> Git -> Create Pull Request -> add Title -> OK (merge requests later)

                               Basic Branching and Merging
Let’s go through a simple example of branching and merging with a workflow that you might use in the real world.
You’ll follow these steps:
Do some work on a website.
Create a branch for a new user story you’re working on.
Do some work in that branch.
At this stage, you’ll receive a call that another issue is critical and you need a hotfix. You’ll do the following:
Switch to your production branch.
Create a branch to add the hotfix.
After it’s tested, merge the hotfix branch, and push to production.
Switch back to your original user story and continue working.
                                                                                                                 */
    }
}
