$(() => {
    $('#btnLogin').click((e) => {
        $('#spinny').show();
        e.preventDefault();
        $.ajax({
            url: '/login',
            method: 'post',
            data: {
                username: $('#username').val(),
                password: $('#password').val()
            }
        })
        .done((utente) => {
            if(utente) {
                localStorage.setItem('user', JSON.stringify(utente));
                location.href = '/home.html';
            } else {
                $('#error').modal('show');
                $('#spinny').hide();
            }
        })
    })

})