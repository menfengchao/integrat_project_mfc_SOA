var vm = new Vue({
    el: '#indexApp',
    data: {
        inputtext:{},
        message: 'MFC'
    },
    methods: {
        submit: function() {
            axios.post('/user/save/.html', {
                firstName: this.inputtext.name,
                lastName: this.inputtext.password
            }).then(function (response) {
                    console.log(response);
                }).catch(function (error) {
                    console.log(error);
                })
        }
    },
})