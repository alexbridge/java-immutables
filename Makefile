
build-jar:
	./gradlew --rerun-tasks jar

.ONESHELL:
run-immutables: build-jar
	@echo '-----------------------------------------------'
	java -cp build/libs/immutables-0.0.1.jar \
	com.github.alexbridge.immutables.ImmutablesApplication
