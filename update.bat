rem # count commits
git rev-list HEAD --count
rem # get upstream changes
git pull --rebase SmallSimpleSafe master
git rev-list HEAD --count
rem # push to my repository
git push origin
