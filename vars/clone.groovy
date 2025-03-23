def call(String gitUrl, String gitBranch){
  echo "Code pull stage"
  git url: "${gitUrl}", branch:"${gitBranch}"
  echo "Code clone successful"
}
