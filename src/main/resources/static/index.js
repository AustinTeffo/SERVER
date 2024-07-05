

fetch('http://localhost:8081/getAllStudents')
            .then(response => response.text())
            .then(message => {
                document.getElementById('message').textContent = message;
            })
            .catch(error => {
                console.error('Error fetching message:', error);
            });