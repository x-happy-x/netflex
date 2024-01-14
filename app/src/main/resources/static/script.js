let url = "http://localhost:8801/engine-rest/"

window.onload = (e) => {
    let body = {
        "variables": {},
        "businessKey": "testKey",
        "withVariablesInReturn": true
    }
    fetch(url + "process-definition/key/:processKey/start", {
        method: "POST",
        body: body
    }).then(r => {
        if (r.status === 200) {
            return r.json()
        }
    })
}