import"./navbarScrolled-4g2gRXiq.js";/* empty css               */function s(e){const n=document.querySelector(`.add-to-cart[data-product-id='${e}']`);if(!n)return;const t=n.dataset.productName,o=parseFloat(n.dataset.productPrice),c=document.getElementById("cart-container");c.style.display="block";const i=document.getElementById("cart-items"),a=document.createElement("div");a.classList.add("product-item"),a.textContent=`${t} - $${o}`,i.appendChild(a),d()}function d(){const e=l(),n=parseInt(document.getElementById("num-people").value)||1,t=e*n;document.getElementById("cart-total").innerText=`Total: $${t.toFixed(2)}`,r(t)}function l(){const e=document.querySelectorAll("#cart-items .product-item");let n=0;return e.forEach(t=>{const o=t.textContent,c=parseFloat(o.split(" - $")[1]);n+=c}),n}function r(e){const n=document.getElementById("pay-btn"),t=`https://example.com/pay?total=${e.toFixed(2)}`;n.setAttribute("href",t)}document.getElementById("cancel-btn").addEventListener("click",function(){document.getElementById("cart-items").innerHTML="",document.getElementById("cart-total").innerText="Total: $0.00",document.getElementById("num-people").value=1,r(0),document.getElementById("cart-container").style.display="none"});document.getElementById("num-people").addEventListener("input",function(){d()});document.getElementById("pay-btn").addEventListener("click",function(){let n=`https://link.mercadopago.com.mx/tourvalledebravo?total=${(l()*(parseInt(document.getElementById("num-people").value)||1)).toFixed(2)}`;window.open(n,"_blank")});fetch("/db.json").then(e=>e.json()).then(e=>{const n=e.map(t=>`
                <div class="col-lg-5">
                    <div class="card">
                        <div class="row g-0">
                            <div class="col-6 col-md-5">
                                <img class="card-img card-fluid rounded-star" src="${t.img}" alt="${t.nombreDestino}">
                            </div>
                            <div class="col-6 col-md-7">
                                <div class="card-body d-flex flex-column">
                                    <div class="h-100">
                                        <h3 class="card-title">${t.nombreDestino}</h3>
                                        <p class="card-text">${t.descripcion}</p>
                                        <h4 class="card-title mb-3">$ <strong>${t.precio}</strong> MXN </h4>
                                        <div>
                                            <button type="button" class="btn btn-info">
                                                <i class="bi bi-handbag me-1"></i>
                                                <a id="button-booking" href="/src/pages/contacto/paginaContacto.html" target="_blank">¡Más Información!</a>
                                            </button>
                                            <br><br>
                                            <button type="button" class="btn btn-info add-to-cart" data-product-id="${t.id}" data-product-name="${t.nombreDestino}" data-product-price="${t.precio}">
                                                <i class="bi bi-handbag me-1"></i>
                                                ¡Reserva ahora!
                                            </button>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            `);document.querySelector("#list-container").innerHTML=n.join(""),document.querySelectorAll(".add-to-cart").forEach(t=>{t.addEventListener("click",o=>{const c=o.target.dataset.productId;s(c)})})}).catch(e=>console.error("Error al obtener datos:",e));window.addEventListener("load",()=>{const e=document.getElementById("preloader"),n=document.getElementById("contenido");setTimeout(()=>{e.style.display="none",n.style.display="block"},3e3)});
