def call(String Project, String NameTag){
  withCredentials([usernamePassword(credentialsId: "dockerHubCred", passwordVariable: "dockerHubPass", usernameVariable:"dockerHubUser")]){
    sh "docker login -u ${dockerHubUser} -p ${dockerHubPass}"
    sh "docker push ${dockerHubUser}/${Project}:${NameTag}"
  }
  
}
