public class GitHUbFlow {
    public static void main(String[] args) {
    /*                     The main concepts behind the Github flow are:
    -Anything in the master branch is deployable.
    -To work on something new, create a descriptively named branch off of master (feature branches)
    -Commit to that branch locally and regularly push your work to remote the same named branch.
    -When you need feedback or help, or you think the branch is ready for merging, open a pull request.
    -After someone else has reviewed and signed off on the feature, you can merge it into master.
    -Once it is merged and pushed to ‘master’, you can and should deploy immediately.

                            The difference between Fetch and Pull:
    !!! Both are used to download new data from a remote repository.Downloading data is an essential step  - because
        the remote data in your local repository is just a "snapshot". It's only as up-to-date as the last time you
        explicitly downloaded fresh data from the remote with "fetch" or "pull".

     Git PULL - is used to update your current HEAD branch with the latest changes from the remote server. This means
                that pull not only downloads new data; it also directly integrates it into your current working files.
                Git Pull = Git Fetch + Git Merge
                This has a couple of consequences:
                1) Since "git pull" tries to merge remote changes with your local ones, a so-called "merge conflict"
                can occur.
                2) Like for many other actions, it's highly recommended to start a "git pull" only with a clean working
                copy. This means that you should not have any uncommitted local changes before you pull.

     Git FETCH - really only downloads new data from a remote repository - but it doesn't integrate any of this new
                 data into your working files. Fetch is great for getting a fresh view on all the things that happened
                 in a remote repository.
       */
    }
}
