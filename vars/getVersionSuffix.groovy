def call(Map parametros) { 
    node {
        if (parametros.esVersionCandidata) { 
            return parametros.rcNumero 
        } else {
            return parametros.rcNumero + '+ci' + env.BUILD_NUMBER
        }
    }
}