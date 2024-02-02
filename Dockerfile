FROM openjdk:17
# Create a new app directory for my application files
RUN mkdir /appDir

#copy the app files from host machine to image filesystem
COPY out/production/FPP/ /appDir

#Set the directory for executing future commands
WORKDIR /appDir

#Run the lectures.Main class
CMD java lectures.Main
