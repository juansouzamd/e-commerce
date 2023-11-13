<!DOCTYPE html>
<html lang="pt-BR">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <meta name="author" content="Juan Souza, Maria Helena, Pedro Ferreira, Juliana Camargo, Thiago shigueto">
    <script
      src="https://kit.fontawesome.com/64d58efce2.js"
      crossorigin="anonymous"
    ></script>
    <link rel="stylesheet" href="assets/css/paginaLogin.css" />
    <title>Login & Criar conta</title>
  </head>
  <body>
    <div class="container">
      <div class="forms-container">
        <div class="signin-signup">
          <form action="/login" class="sign-in-form"  method="post">
            <h2 class="title">Fazer login</h2>
            <div class="input-field">
              <i class="fas fa-user"></i>
              <input type="text" placeholder="E-mail" name="user-email" id="user-email />
            </div>
            <div class="input-field">
              <i class="fas fa-lock"></i>
              <input type="password" placeholder="Senha" name="user-senha" id="user-senha"/>
            </div>
            <input type="submit" value="Entrar" class="btn solid" />
            <p class="social-text">Ou faça login com as redes sociais</p>
            <div class="social-media">
              <a href="#" class="social-icon">
                <i class="fab fa-facebook-f"></i>
              </a>
              <a href="#" class="social-icon">
                <i class="fab fa-twitter"></i>
              </a>
              <a href="#" class="social-icon">
                <i class="fab fa-google"></i>
              </a>
              <a href="#" class="social-icon">
                <i class="fab fa-linkedin-in"></i>
              </a>
            </div>
          </form>
          <!-- Formulário de Criação de Conta -->
                    <form action="/create-user" class="sign-up-form" method="post">
                      <h2 class="title">Criar conta</h2>
                      <div class="input-field">
                        <i class="fas fa-user"></i>
                        <input type="text" placeholder="Nome" name="user-name" id="user-name"/>
                      </div>

                      <div class="input-field">
                        <i class="fas fa-file"></i>
                        <input type="cpf" placeholder="Cpf" name="user-cpf" id="user-cpf"/>
                      </div>

                      <div class="input-field">
                        <i class="fas fa-phone"></i>
                        <input type="telefone" placeholder="Telefone" name="user-telefone" id="user-telefone"/>
                      </div>

                      <div class="input-field">
                        <i class="fas fa-calendar"></i>
                        <input type="data-nasc" placeholder="Data Nascimento" name="user-data_nasc" id="user-data_nasc"/>
                      </div>

                      <div class="input-field">
                        <i class="fas fa-envelope"></i>
                        <input type="email" placeholder="E-mail" name="user-email" id="user-email"/>
                      </div>
                      <div class="input-field">
                        <i class="fas fa-lock"></i>
                        <input type="password" placeholder="Senha" name="user-senha" id="user-senha"/>
                      </div>
                      <input type="submit" class="btn" value="Continuar" />
                    </form>
                    <!-- Fim Formulário de Criação de Conta -->
        </div>
      </div>

      <div class="panels-container">
        <div class="panel left-panel">
          <div class="content">
            <h3>Novo aqui?</h3>
            <p>
              Crie uma conta e fique por dentro de todas as novidades!!
            </p>
            <button class="btn transparent" id="sign-up-btn">
              Criar conta
            </button>
          </div>
          <img src="assets/img/front-end/login/tenis01.png" class="image" alt="" />
        </div>
        <div class="panel right-panel">
          <div class="content">
            <h3>Já possui uma conta?</h3>
            <p>
              Faça login e aproveite todas as promoções disponíveis!
            </p>
            <button class="btn transparent" id="sign-in-btn">
              Fazer login
            </button>
          </div>
          <img src="assets/img/front-end/login/tenis02.png" class="image" alt="" />
        </div>
      </div>
    </div>

    <script src="assets/js/login.js"></script>
  </body>
</html>