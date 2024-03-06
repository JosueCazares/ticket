function cargaMenu(){
alert("carga");
window.location.href = "http://localhost:80/tickets/html/tickets.html";
alert("adios");
}


async function cargaTicket(){
    const response = await fetch("ticket.html");
    const html = await response.text();

    // Insertar HTML en el elemento con ID 'contenido'
    document.getElementById('contenido').innerHTML = html;
}