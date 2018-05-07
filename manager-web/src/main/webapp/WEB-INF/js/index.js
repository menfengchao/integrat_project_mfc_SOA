/**配置axios全局路径实例**/
var instance = axios.create({
    baseURL:"http://localhost:8080",
    timeout:1000,
    headers: {'X-Custom-Header':'foobar'}
});
/** Vue **/
var vm = new Vue({
    el: '#indexApp',
    data: {
        inputtext:{},
        message: 'MFC'
    },
    methods: {
        submit: function() {
            console.log("234");
            axios.get('/user/save', {
                params: {
                    nickname: this.inputtext.name,
                    pswd: this.inputtext.password
                }
            }).then(function (response) {
                    console.log(response);
                }).catch(function (error) {
                    console.log(error);
                });
        }
    },
})