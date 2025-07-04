# Use official lightweight OpenJDK image
FROM openjdk:21-slim

# Argument to accept the JAR file location during build
ARG JAR_FILE=target/*.jar

# Create a directory for logs and make it writable
RUN mkdir -p /home/SmsService/logs && chmod -R 777 /home/SmsService/logs

# Copy the JAR file from the host into the image
COPY ${JAR_FILE} /app/app.jar

# Set environment variables
ENV SPRING_PROFILES_ACTIVE=develop1
ENV PORT=8081
ENV TZ=UTC

# Set working directory
WORKDIR /app

# Expose the port your app will run on (optional for local use, but useful)
EXPOSE ${PORT}

# Run the application
CMD ["sh", "-c", "java -jar app.jar -Dserver.port=${PORT} -Dspring.profiles.active=${SPRING_PROFILES_ACTIVE}"]