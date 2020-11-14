public class BranchInGit {
    public static void main(String[] args) {

    /*                         BRANCH IN GIT & GITHUB

             Branch in Git & GitHub is a unique set of code changes with a unique name. Timeline.
             Each repository has one default branch(master), and CAN have multiple other branches.
             The master(main) branch — the one where all changes eventually get merged back into.
             Never, ever push anything to master that is not tested, or that breaks the build. Because the master branch
                                            is deployable. It is your production code, ready to roll out into the world.

                               WHY CREATE OTHER BRANCHES?
             To begin working on anything new in a project, or to change existing things, you create a branch
                                                                                           off the stable master branch.
                               Where is your head?
             The HEAD in Git is the pointer to the current branch reference, which is in turn a pointer to the last
             commit you made or the last commit that was checked out into your working directory.You can imagine HEAD
             as the “current committed branch”. When working with Git, only one branch can be checked out at a time.

                               To Create a New Branch on IntelliJ:
             on right bottom corner under 'Event Log' click 'Git: master' -> name -> Create

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