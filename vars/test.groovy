
def checkEmail() {
    def toEmail = ''
    println toEmail
    return toEmail ?: null
}
def call() {
    println checkEmail()

    println "Hello World"
    return this
}

call()