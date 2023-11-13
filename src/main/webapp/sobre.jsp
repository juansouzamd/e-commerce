<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="pt-BR">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="author" content="Juan Souza, Maria Helena, Pedro Ferreira, Juliana Camargo, Thiago shigueto">
    <title>Cureate</title>
    <link rel="stylesheet" href="https://pro.fontawesome.com/releases/v5.10.0/css/all.css" />

    <link rel="stylesheet" href="assets/css/sobre.css">
</head>

<body>

    <section id="header">
        <a href="index.jsp"><img src="assets/img/front-end/logo.png" class="logo" alt=""></a>

        <div>
            <ul id="navbar">
                <li><a href="index.jsp">Início</a></li>
                <li><a href="sobre.jsp">Sobre</a></li>
                <li><a href="contato.jsp">Contato</a></li>
                <li id="lg-bag"><a href="favoritos.jsp"><i class="fas fa-heart"></i></a></li>
                <li id="lg-bag"><a href="carrinho.jsp"><i class="far fa-shopping-bag"></i></a></li>
                <li id="lg-bag"><a href="paginaLogin.jsp"><i class="fas fa-user"></i></a></li>
                <a href="#" id="close"><i class="far fa-times"></i></a>
            </ul>
        </div>
        <div id="mobile">
             <a href="favoritos.jsp"><i class="fas fa-heart"></i></a>
            <a href="carrinho.jsp"><i class="far fa-shopping-bag"></i></a>
            <a href="paginaLogin.jsp"><i class="fas fa-user"></i></a>
            <i id="bar" class="fas fa-outdent"></i>
        </div>
    </section>

       <header class="header">
           <p class="p">Descubra o conforto, estilo e inovação em cada passo.</p>
       </header>

       <section class="about">
           <h2>Sobre Nós</h2>
           <p>A Cureate é mais do que uma loja de tênis; é uma experiência dedicada a fornecer os melhores produtos para os amantes de tênis em todo o mundo. Com uma seleção cuidadosa dos mais recentes lançamentos e clássicos atemporais, buscamos a combinação perfeita de estilo e desempenho.</p>
           <p>Nossos especialistas estão sempre atentos às últimas tendências da moda e inovações tecnológicas para garantir que você esteja à frente do jogo. Acreditamos que os tênis não são apenas calçados; são uma expressão do seu estilo de vida, paixões e conquistas.</p>
       </section>

       <section class="mission">
           <h2>Nossa Missão</h2>
           <p>Nossa missão na Cureate é proporcionar a você uma jornada única de descoberta e satisfação. Queremos inspirar a confiança em cada passo que você der, fornecendo produtos de alta qualidade que se destacam no conforto, durabilidade e estilo.</p>
           <p>Além disso, estamos comprometidos com práticas sustentáveis e éticas. Valorizamos o meio ambiente e buscamos constantemente maneiras de minimizar nosso impacto. Ao escolher a Cureate, você não está apenas investindo em produtos excepcionais, mas também em um futuro mais sustentável.</p>
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


        <script src="assets/js/script.js"></script>
    </body>

    </html>