FROM alpine:latest
LABEL maintainer=” Cesar Lara Avila<checha@claraa.io>”
LABEL description=”Este Dockerfile de ejemplo instala NGINX”
RUN apk add --update nginx && \
 rm -rf /var/cache/apk/* && \
 mkdir -p /tmp/nginx/
COPY files/nginx.conf /etc/nginx/nginx.conf
COPY files/default.conf /etc/nginx/conf.d/default.conf ADD
files/html.tar.gz /usr/share/nginx/
EXPOSE 80/tcp
ENTRYPOINT [“nginx”]
CMD [“-g”, “daemon off;”]