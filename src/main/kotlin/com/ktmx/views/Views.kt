
public fun html(): String {
    return """
        <!DOCTYPE html>
        <html lang="en">
        <head>
            <meta charset="UTF-8">
            <meta name="viewport" content="width=device-width, initial-scale=1.0">
            <title>Your Page Title</title>
            <script src="https://unpkg.com/htmx.org@1.9.6" integrity="sha384-FhXw7b6AlE/jyjlZH5iHa/tTe9EpJ1Y55RjcgPbjeWMskSxZt1v9qkxLJWNJaGni" crossorigin="anonymous"></script>
            <script src="https://cdn.tailwindcss.com"></script>
            <script defer src="https://cdn.jsdelivr.net/npm/alpinejs@3.x.x/dist/cdn.min.js"></script>

        </head>
        <body>
            <header class="text-3xl">
                <h1>Your Website</h1>
            </header>
            <div x-data="{ count: 0 }">
                <button x-on:click="count++">Increment</button>
             
                <span x-text="count"></span>
            </div>
            <nav>
                <!-- Your navigation links go here -->
                <button class="bg-red-200 hover:bg-red-300" hx-post="/clicked" hx-swap="outerHTML">
                   Click Me
                </button>
            </nav>

            <main>
                <section>
                    <h2>Welcome to our website!</h2>
                    <p>This is a simple HTML template.</p>
                </section>

                <!-- More sections/content can be added here -->
            </main>

            <footer>
                <p>&copy; 2023 Your Website. All rights reserved.</p>
            </footer>
        </body>
        </html>
    """.trimIndent()
}