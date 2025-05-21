/**
 * 
 */
// Registration Logic
const registerForm = document.getElementById("registerForm");
if (registerForm) {
    registerForm.addEventListener("submit", async (e) => {
        e.preventDefault();
        const user = {
            name: document.getElementById("name").value,
            email: document.getElementById("email").value,
            password: document.getElementById("password").value
        };

        const response = await fetch("http://localhost:8080/api/users/register", {
            method: "POST",
            headers: { "Content-Type": "application/json" },
            body: JSON.stringify(user)
        });

        if (response.ok) {
            alert("Registration successful!");
            window.location.href = "index.html";
        } else {
            alert("Registration failed!");
        }
    });
}

// Login Logic
const loginForm = document.getElementById("loginForm");
if (loginForm) {
    loginForm.addEventListener("submit", async (e) => {
        e.preventDefault();
        const credentials = {
            email: document.getElementById("loginEmail").value,
            password: document.getElementById("loginPassword").value
        };

        const response = await fetch("http://localhost:8080/api/users/login", {
            method: "POST",
            headers: { "Content-Type": "application/json" },
            body: JSON.stringify(credentials)
        });

        const isAuthenticated = await response.json();
        if (isAuthenticated) {
            alert("Login successful!");
            // redirect to booking page (to be created later)
        } else {
            alert("Invalid credentials!");
        }
    });
}
