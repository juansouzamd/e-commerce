<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="pt-BR">
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="author" content="Juan Souza, Maria Helena, Pedro Ferreira, Juliana Camargo, Thiago shigueto">
    <title>Cureate</title>
    <link rel="stylesheet" href="https://pro.fontawesome.com/releases/v5.10.0/css/all.css" />

    <link rel="stylesheet" href="assets/css/style.css">
</head>

<body>

     <section id="header">
                    <a href="/listar-produtos"><img src="assets/img/front-end/logo.png" class="logo" alt=""></a>

                    <div>
                        <ul id="navbar">
                            <li><a href="/listar-produtos">Início</a></li>
                            <li><a href="sobre.jsp">Sobre</a></li>
                            <li><a href="contato.jsp">Contato</a></li>
                            <li id="lg-bag"><a href="/exibir-carrinho"><i class="far fa-shopping-bag"></i></a></li>
                            <li id="lg-bag"><a href="/login?id=${param.id}"><i class="fas fa-user"></i></a></li>
                            <li id="lg-bag"><a href="/logout"><i class="fas fa-sign-out"></i></a></li>
                            <a href="#" id="close"><i class="far fa-times"></i></a>
                        </ul>
                    </div>
                    <div id="mobile">
                        <a href="carrinho.jsp"><i class="far fa-shopping-bag"></i></a>
                        <a href="/login"><i class="fas fa-user"></i></a>
                        <a href="/logout"><i class="fas fa-sign-out"></i></a>
                        <a href="/logout"><i id="bar" class="fas fa-outdent"></i></a>
                    </div>
                </section>

    <section id="prodetails" class="section-p1">
        <div class="single-pro-image">
            <img src="${produtoItems.get(1).caminhoImagem}"
                width="100%" id="MainImg" alt="">

            <div class="small-img-group">
                <div class="small-img-col">
                    <img src="${produtoItems.get(2).caminhoImagem}"
                        width="100%" class="small-img" alt="">
                </div>
                <div class="small-img-col">
                    <img src="${produtoItems.get(3).caminhoImagem}"
                        width="100%" class="small-img" alt="">
                </div>
                <div class="small-img-col">
                    <img src="${produtoItems.get(4).caminhoImagem}"
                        width="100%" class="small-img" alt="">
                </div>
                <div class="small-img-col">
                    <img src="${produtoItems.get(0).caminhoImagem}"
                        width="100%" class="small-img" alt="">
                </div>
            </div>
        </div>

        <div class="single-pro-details">
            <h6>Produto / ${produto.categoria}</h6>
            <h4>${produto.nome}</h4>
            <h2>R$ ${produto.preco}</h2>
            <select>
                <option>Selecione o tamanho</option>
                <option>38</option>
                <option>39</option>
                <option>40</option>
                <option>41</option>
                <option>42</option>
                <option>43</option>
                <option>44</option>
            </select>
            <form action="/carrinho?produtoId=${produto.id}&preco=${produto.preco}" method="post">
            <input type="number" value="1" name="quantidade" id="quantidade">
            <input hidden value="${produtoItems.get(1).caminhoImagem}" name="imagem" id="imagem">
            <input hidden value="${produto.nome}" name="produto" id="produto">
            <button class="normal">Adicionar ao carrinho</button>
            </form>
            <h4>Detalhes do produto:</h4>
            <span>
                ${produto.descricao}
            </span>
        </div>
    </section>

    <section id="product1" class="section-p1">
        <h2>Produtos em destaque</h2>
        <p>Desenvolvidos para seu maior conforto</p>
        <div class="pro-container">
            <div class="pro">
                <a href="#" class="decoration">
                    <img src="assets/img/front-end/produtos/tenis/Tenis Nike LeBron 20 Masculino/Tenis Nike LeBron 20 Masculino01.png"
                        alt="">
                    <div class="des">
                        <span>Nike</span>
                        <h5>Tênis Nike LeBron 20</h5>
                        <div class="star">
                            <i class="fas fa-star"></i>
                            <i class="fas fa-star"></i>
                            <i class="fas fa-star"></i>
                            <i class="fas fa-star"></i>
                            <i class="fas fa-star"></i>
                        </div>
                        <h4>R$1299,99</h4>
                    </div>
                </a>
                <a href="#"><i class="fal fa-shopping-cart cart"></i></a>
            </div>
            <div class="pro">
                <a href="#" class="decoration">
                    <img src="assets/img/front-end/produtos/tenis/Tenis Jordan MVP Masculino/Tenis Jordan MVP Masculino01.png"
                        alt="">
                    <div class="des">
                        <span>Nike</span>
                        <h5>Tênis Jordan MVP</h5>
                        <div class="star">
                            <i class="fas fa-star"></i>
                            <i class="fas fa-star"></i>
                            <i class="fas fa-star"></i>
                            <i class="fas fa-star"></i>
                            <i class="fas fa-star"></i>
                        </div>
                        <h4>R$999,99</h4>
                    </div>
                </a>
                <a href="#"><i class="fal fa-shopping-cart cart"></i></a>
            </div>
            <div class="pro">
                <a href="#" class="decoration">
                    <img src="assets/img/front-end/produtos/tenis/Air Jordan 1 Retro High OG GS Lucky Green/Air Jordan 1 Retro High01.png"
                        alt="">
                    <div class="des">
                        <span>Nike</span>
                        <h5>Tênis Air Jordan 1 Retro High</h5>
                        <div class="star">
                            <i class="fas fa-star"></i>
                            <i class="fas fa-star"></i>
                            <i class="fas fa-star"></i>
                            <i class="fas fa-star"></i>
                            <i class="fas fa-star"></i>
                        </div>
                        <h4>R$999,99</h4>
                    </div>
                </a>
                <a href="#"><i class="fal fa-shopping-cart cart"></i></a>
            </div>
            <div class="pro">
                <a href="#" class="decoration">
                    <img src="assets/img/front-end/produtos/tenis/LeBron NXXT Gen/LeBron NXXT Gen01.png" alt="">
                    <div class="des">
                        <span>Nike</span>
                        <h5>Tênis LeBron NXXT Gen</h5>
                        <div class="star">
                            <i class="fas fa-star"></i>
                            <i class="fas fa-star"></i>
                            <i class="fas fa-star"></i>
                            <i class="fas fa-star"></i>
                            <i class="fas fa-star"></i>
                        </div>
                        <h4>R$1299,99</h4>
                    </div>
                </a>
                <a href="#"><i class="fal fa-shopping-cart cart"></i></a>
            </div>

        </div>
    </section>

    <section id="newsletter" class="section-p1 section-m1">
        <div class="newstext">
            <h4>Seja o primeiro a saber</h4>
            <p>Receba as novidades da nossa loja e saiba antes dos <span>futuros lançamentos!</span> </p>
        </div>
        <div class="form">
            <input type="text" placeholder="Digite seu e-mail">
            <button class="normal">Enviar</button>
        </div>
    </section>

    <footer class="section-p1">
        <div class="col">
            <img class="logo" src="img/cureate01.png" alt="">
            <h4>Contato</h4>
            <p><strong>Endereço: </strong> Av. Eng. Eusébio Stevaux, 823</p>
            <p><strong>Telefone:</strong> 11 99999-9999</p>
            <div class="follow">
                <h4>Siga!</h4>
                <div class="icon">
                    <i class="fab fa-facebook-f"></i>
                    <i class="fab fa-twitter"></i>
                    <i class="fab fa-instagram"></i>
                    <i class="fab fa-pinterest-p"></i>
                    <i class="fab fa-youtube"></i>
                </div>
            </div>
        </div>

        <div class="col">
            <h4>Sobre</h4>
            <a href="#">Sobre a empresa</a>
            <a href="#">Informações de entregas</a>
            <a href="#">Política e privacidade</a>
            <a href="#">Termos e condições</a>
            <a href="#">Entre em contato</a>
        </div>

        <div class="col">
            <h4>Minha conta</h4>
            <a href="#">Entrar</a>
            <a href="#">Ver carrinho</a>
            <a href="#">Meus favoritos</a>
            <a href="#">Meus pedidos</a>
            <a href="#">Ajuda</a>
        </div>

        <div class="col install">
            <h4>Baixe nosso app</h4>
            <p>Disponível em App Store e Google Play</p>
            <div class="row">
                <img src="assets/img/front-end/pagamentos/app.jpg" alt="">
                <img src="assets/img/front-end/pagamentos/play.jpg" alt="">
            </div>
            <p>Formas de pagamento</p>
            <img src="assets/img/front-end/pagamentos/pay.png" alt="">
        </div>

        <div class="copyright">
            <p>© 2023, Senac - E-commerce projeto integrador</p>
        </div>
    </footer>

    <script src="assets/js/produto.js"></script>
    <script src="assets/js/script.js"></script>
</body>

</html>