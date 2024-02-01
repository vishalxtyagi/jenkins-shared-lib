def call() {
    def toEmail = env.USER_EMAIL

    def checkEmail() {
        println toEmail
        return toEmail ?: null
    }

    println "Hello World";
    return this;
}
