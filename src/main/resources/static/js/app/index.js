var main = {
    init : function () {
        var _this = this;
        $('#btn').on('click', function () {
            _this.search();
        });

    },
    search : function () {
        var handle = $('#handle').val()
        $.ajax({
            type: 'GET',
            url: '/api/getUser?handle=BueVonHun',
            dataType: 'json'
        }).fail(function (error) {
            alert('failed');
        }).done(function (json) {
            alert('done');
            alert(json)
        })
    }
};
main.init();