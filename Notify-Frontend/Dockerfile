FROM node:latest as builder

RUN mkdir -p /app

WORKDIR /app

COPY package.json package-lock.json ./
RUN npm install

COPY . .
RUN npm run build --prod

CMD ["npm","start"]

FROM nginx:alpine
COPY src/nginx/etc/conf.d/default.conf /etc/nginx/conf/default.conf
COPY --from=builder app/dist/notify-frontend usr/share/nginx/html