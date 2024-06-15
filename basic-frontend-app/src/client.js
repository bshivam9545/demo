import fetch from "unfetch";

export const createUser = user => {
    fetch("/user/createUser",{
    headers:{
    'content-type':'application/json'},
    method:'POST'
    body:JSON.stringify(user)
    })
}