<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<link href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/pub/css/global-style.css">
<jsp:include page="include/header.jsp"/>

 <section class="hero bg-primary text-white text-center py-5">
        <div class="container">
            <h1>Welcome to Your Website</h1>
            <p>Your message or tagline goes here.</p>
            <a href="#" class="btn btn-light btn-lg">Get Started</a>
        </div>
    </section>

    <!-- Features Section -->
    <section class="features py-5">
        <div class="container">
            <div class="row">
                <div class="col-lg-4">
                    <div class="feature-item text-center">
                        <i class="fa fa-check-circle fa-3x mb-3"></i>
                        <h3>Feature 1</h3>
                        <p>Description of feature 1.</p>
                    </div>
                </div>
                <div class="col-lg-4">
                    <div class="feature-item text-center">
                        <i class="fa fa-cog fa-3x mb-3"></i>
                        <h3>Feature 2</h3>
                        <p>Description of feature 2.</p>
                    </div>
                </div>
                <div class="col-lg-4">
                    <div class="feature-item text-center">
                        <i class="fa fa-star fa-3x mb-3"></i>
                        <h3>Feature 3</h3>
                        <p>Description of feature 3.</p>
                    </div>
                </div>
            </div>
        </div>
    </section>

    <!-- Call to Action Section -->
    <section class="cta bg-light py-5">
        <div class="container">
            <div class="row">
                <div class="col-md-8">
                    <h2>Ready to Get Started?</h2>
                    <p>Join our community and explore our services.</p>
                </div>
                <div class="col-md-4 text-center">
                    <a href="#" class="btn btn-primary btn-lg">Sign Up Now</a>
                </div>
            </div>
        </div>
    </section>
<section class="carousel-section">
    <div id="imageCarousel" class="carousel slide" data-ride="carousel">
        <ol class="carousel-indicators">
            <li data-target="#imageCarousel" data-slide-to="0" class="active"></li>
            <li data-target="#imageCarousel" data-slide-to="1"></li>
            <li data-target="#imageCarousel" data-slide-to="2"></li>
        </ol>
        <div class="carousel-inner">
            <div class="carousel-item active">
                <img src="images/slide1.jpg" class="d-block w-100" alt="Slide 1">
            </div>
            <div class="carousel-item">
                <img src="images/slide2.jpg" class="d-block w-100" alt="Slide 2">
            </div>
            <div class="carousel-item">
                <img src="images/slide3.jpg" class="d-block w-100" alt="Slide 3">
            </div>
        </div>
        <a class="carousel-control-prev" href="#imageCarousel" role="button" data-slide="prev">
            <span class="carousel-control-prev-icon" aria-hidden="true"></span>
            <span class="sr-only">Previous</span>
        </a>
        <a class="carousel-control-next" href="#imageCarousel" role="button" data-slide="next">
            <span class="carousel-control-next-icon" aria-hidden="true"></span>
            <span class="sr-only">Next</span>
        </a>
    </div>
</section>




<script src="${pageContext.request.contextPath}/js/myScript.js"></script>


<jsp:include page="include/footer.jsp"/>

