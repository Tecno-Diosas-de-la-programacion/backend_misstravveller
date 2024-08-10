(function(){const o=document.createElement("link").relList;if(o&&o.supports&&o.supports("modulepreload"))return;for(const a of document.querySelectorAll('link[rel="modulepreload"]'))r(a);new MutationObserver(a=>{for(const e of a)if(e.type==="childList")for(const i of e.addedNodes)i.tagName==="LINK"&&i.rel==="modulepreload"&&r(i)}).observe(document,{childList:!0,subtree:!0});function s(a){const e={};return a.integrity&&(e.integrity=a.integrity),a.referrerPolicy&&(e.referrerPolicy=a.referrerPolicy),a.crossOrigin==="use-credentials"?e.credentials="include":a.crossOrigin==="anonymous"?e.credentials="omit":e.credentials="same-origin",e}function r(a){if(a.ep)return;a.ep=!0;const e=s(a);fetch(a.href,e)}})();const c=[{name:"Inicio",url:"/index.html",active:!1,visible:!0},{name:"Nosotros",url:"/src/pages/nosotros/paginaNosotros.html",active:!1,visible:!0},{name:"Productos",url:"/src/pages/productos/productos.html",active:!1,visible:!0},{name:"Contacto",url:"/src/pages/contacto/paginaContacto.html",active:!1,visible:!0},{name:"Ingresar",url:"/src/pages/ingresar/ingresar.html",active:!1,visible:!0},{name:"Formulario",url:"/src/pages/formulario/formulario.html",active:!1,visible:!1}],n=t=>t.split("/").pop(),d=()=>{const t=window.location.pathname;return n(t)},m=(t,o)=>{const s={role:"customer",isAdmin:!1,expiration:0},r=JSON.parse(localStorage.getItem("userSesion"));return r!==null&&(s.role=r.role,s.isAdmin=r.isAdmin,s.expiration=r.expiration,s.isAdmin&&(s.isAdmin=!0)),t.forEach(e=>{n(e.url)===o&&(e.active=!0),s.isAdmin&&(e.visible=!0)}),t.map(e=>`
        <li class="nav-item" style="visibility: ${e.visible?"visible":"hidden"}"> 
          <a class="nav-link ${e.active?"active":""}" href="${e.url}"> ${e.name} </a>            
        </li>
    `).join("")},l=()=>{const t=d();return`
    <nav class="navbar navbar-expand-lg fixed-top custom-navbar">
      <div class="container-fluid">
        <a class="navbar-brand" href="/index.html">
          <img id="logo-missTravveller" src="/img/Logo_MissTravveller.png" alt="Logo">
        </a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarCollapse" aria-controls="navbarCollapse" aria-expanded="false" aria-label="Toggle navigation">
          <img id="hamburguesa" src="/img/hamburguesa.png" alt="Imagen patito despliega menú">
        </button>
        <div class="collapse navbar-collapse" id="navbarCollapse">
          <ul class="navbar-nav ms-auto me-auto mb-2 mb-md-0">

            ${m(c,t)}
          </ul>
        </div>
      </div>
    </nav>
    <div class="spacer"></div>
  `};document.querySelector("#navbar-app").innerHTML=l();window.addEventListener("load",()=>{const t=document.getElementById("preloader"),o=document.getElementById("contenido");setTimeout(()=>{t.style.display="none",o.style.display="block"},3e3)});const u=()=>`
    <div class="footer-elementos d-flex flex-wrap justify-content-between align-items-center py-2">
        <a class="nav align-text-left" href="#">
          <img class="float-end" src="/img/boton_regreso.png" alt="Botón flecha" width="40" height="40">
        </a>
    
        <ul class="nav col-md-3.5 justify-content-left">
          <li class="foot-item">
            <a class="footer.redes" href="https://www.facebook.com/profile.php?id=61559062033043" target="_blank">
              <i id="footer-facebook" class="bi bi-facebook"></i>
            </a>
          </li>
          <li class="foot-item">
            <a class="footer.redes" href="https://www.instagram.com/misstraveler.mx?igsh=bnFjbDdsMzkybnVx"target="_blank">
              <i id="footer-instagram" class="bi bi-instagram" width=""></i>
            </a>
          </li>
          <li class="foot-item">
            <a class="footer.redes" href="https://www.tiktok.com/@misstraveler.mx?_t=8oiBgjYc4NJ&_r=1"target="_blank">
              <i id="footer-tiktok" class="bi bi-tiktok"></i>
            </a>
          </li>
        </ul>
        <a href="/src/pages/avisoPrivacidad/avisoPrivacidad.html">
          <h4>Aviso de Privacidad</h4>
        </a>
        
      </div>

  `;document.querySelector("#navbar-app").innerHTML=l();document.querySelector("#footer-app").innerHTML=u();window.addEventListener("load",()=>{const t=document.getElementById("preloader"),o=document.getElementById("contenido");setTimeout(()=>{t.style.display="none",o.style.display="block"},3e3)});document.addEventListener("DOMContentLoaded",function(){var t=document.querySelector(".navbar");window.addEventListener("scroll",function(){window.scrollY>50?t.classList.add("navbar-scrolled"):t.classList.remove("navbar-scrolled")})});
