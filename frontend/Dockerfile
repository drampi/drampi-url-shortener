FROM node:13.12.0-alpine AS builder

WORKDIR /usr/src/app

COPY package*.json ./

RUN npm install

ENV PATH="./node_modules/.bin:$PATH"

COPY . .
RUN npm run build

FROM nginx:1.19.3-alpine
COPY --from=builder /usr/src/app/dist/frontend /usr/share/nginx/html
COPY ./nginx.conf.prod /etc/nginx/conf.d/nginx.conf
