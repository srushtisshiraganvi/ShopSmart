# 🛍️ ShopSmart — Smart Product Management App

ShopSmart is a **Spring Boot + Thymeleaf + MySQL** web application for managing products efficiently.  
It provides full **CRUD functionality (Create, Read, Update, Delete)** with a clean UI and REST API support.  
Ideal for beginners learning **Spring MVC + Thymeleaf** integration and for small business inventory systems.

---

## 🚀 Features

✅ Add new products with name, category, price, rating, and description  
✅ View all products in a responsive, user-friendly table  
✅ Edit or delete existing products easily  
✅ Integrated REST API endpoints  
✅ MySQL database integration  
✅ Beautiful Thymeleaf-based UI  
✅ Error-handling and clean backend architecture  

---

## 🧠 Tech Stack

| Layer | Technology |
|-------|-------------|
| **Frontend (View)** | Thymeleaf, HTML5, CSS3, Bootstrap |
| **Backend** | Spring Boot, Spring MVC, Spring Data JPA |
| **Database** | MySQL |
| **Build Tool** | Maven |
| **Server** | Apache Tomcat (embedded) |

---

## ⚙️ Setup Instructions

### 1️⃣ Clone the Repository
``bash
git clone https://github.com/<your-username>/shopsmart.git
cd shopsmart
2️⃣ Configure MySQL Database
Open application.properties and update:

properties
Copy code
spring.datasource.url=jdbc:mysql://localhost:3306/shopsmartdb
spring.datasource.username=root
spring.datasource.password=yourpassword
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true



📦 API Examples
➕ Add Product
POST http://localhost:8080/products

json
Copy code
{
  "name": "Wireless Mouse",
  "category": "Electronics",
  "price": 599.0,
  "rating": 4.5,
  "description": "Smooth, ergonomic wireless mouse"
}
🗑️ Delete Product
DELETE http://localhost:8080/products/1

🖼️ UI Preview
✨ The UI is built using Thymeleaf + Bootstrap with modern responsive design.

View	Description
🏠 Home	Lists all products in a styled table
➕ Add Product	Form to create a new product
✏️ Edit Product	Update existing product details

💡 Future Enhancements
Add user authentication (Spring Security)
Integrate React frontend
Add search and pagination
Deploy to AWS EC2 or Render

👩‍💻 Developer
Srushti Sanjay Shiraganvi
💼 Aspiring Full Stack Developer | Java | Spring Boot | React |DevOps
📍 Bengaluru, India
]
