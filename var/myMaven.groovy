def call() {
  bat 'mvn install'
  bat 'mvn -Smaven.test.failure.ignore= true clean package'
    }
