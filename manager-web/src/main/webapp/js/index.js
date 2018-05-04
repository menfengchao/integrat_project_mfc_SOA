var vm = new Vue({
    el: '#indexApp',
    data: {
        inputtext:{},
        message: 'MFC'
    },
    methods: {
        submit: function() {
            console.log(this.inputtext);
        }
    },
})