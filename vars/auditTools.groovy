def call() { // 2
    node { // 1
        sh '''
            git version
            docker version
            node --version
            npm version
        '''
    }
}