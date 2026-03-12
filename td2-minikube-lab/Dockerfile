FROM ubuntu:22.04

RUN apt-get update && apt-get install -y \
    curl conntrack docker.io sudo iptables iproute2 ca-certificates tar \
    && rm -rf /var/lib/apt/lists/*

# 1. Kubectl
RUN curl -LO "https://dl.k8s.io/release/$(curl -L -s https://dl.k8s.io/release/stable.txt)/bin/linux/amd64/kubectl" \
    && install -o root -g root -m 0755 kubectl /usr/local/bin/kubectl

# 2. Minikube
RUN curl -LO https://storage.googleapis.com/minikube/releases/latest/minikube-linux-amd64 \
    && install minikube-linux-amd64 /usr/local/bin/minikube

CMD ["/bin/bash"]