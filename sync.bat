rem # count commits
git rev-list HEAD --count
rem # get changes in my repository
git pull --rebase origin
git rev-list HEAD --count
rem # push to my repository
git push origin
