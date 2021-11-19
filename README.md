# password

Reading encrypted password from configuration file.
You can encrypt values by:
mvn jasypt:encrypt-value -Djasypt.encryptor.password="password" -Djasypt.plugin.value="value"
and decrypt by :
mvn jasypt:decrypt-value -Djasypt.encryptor.password="password" -Djasypt.plugin.value="..."
To run the application you need to set environment variable JASYPT_ENCRYPTOR_PASSWORD to KAMIL