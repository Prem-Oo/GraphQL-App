
# GraphQL To-Do Application
Overview:
This project is a full-stack to-do application built with GraphQL, leveraging Spring Boot for the backend and React for the frontend. The application demonstrates seamless integration between the frontend and backend services, optimized deployment using Docker.

# Features
GraphQL Integration: Efficient querying and manipulation of data using GraphQL.

Spring Boot Backend: Robust backend services with Spring Boot.

React Frontend: Dynamic and interactive user interface with React-Redux.

Dockerized Deployment: Containerized application for consistent and scalable deployment.


# Technologies Used
Backend: Spring Boot, GraphQL, DataJPA, PostgreSQL.

Frontend: ReactJS, Redux-Toolkit, Apollo Client, JavaScript, HTML, TailwindCSS

# Steps:
`
git clone https://github.com/YourRepo/YourFrontendRepo.git

git clone https://github.com/YourRepo/YourBackendRepo.git

cd YourFrontendRepo

npm install

npm run build

cd YourBackendRepo

mvn clean package

docker build --platform linux/amd64 -t your-dockerhub-username/your-image-name:latest .

docker push your-dockerhub-username/your-image-name:latest

`
