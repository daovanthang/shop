//open and close mobile menu

const menuOpen = document.querySelector('#menu__open');
const menuClose = document.getElementById('#menuClose');
const menu = document.querySelector('.header__nav');
const html = document.querySelector('html');


  menuOpen.addEventListener('click', function(){
      menu.classList.add('open');
      html.classList.add('block')
  });

  menuClose.addEventListener('click', function(){
      menu.classList.remove('open');
      html.classList.remove('block');
  });

//open subnav list for mobile menu
const navItem = document.querySelectorAll('.nav__item');
const subnavList = document.querySelectorAll('.subnav__list');

    navItem.forEach((item, i) =>{
      item.addEventListener('click', function(){
        this.classList.toggle('open')
        
      });
    });

// open search form
const searchOpen = document.querySelector('#search__open');
const searchForm = document.querySelector('.header__form');
  searchOpen.addEventListener('click', function(){
      searchForm.classList.toggle('open');
  });


//change text for shop button
const btn = document.querySelectorAll(".btn-shop");
    btn.forEach((item, i) =>{
      item.addEventListener('click', function(){
        if(item.classList.contains('btn--wishlist')){
          item.classList.toggle('click-added');
        } else{
          item.classList.add('click-added');
          setTimeout(function(){
           item.classList.remove('click-added');
         }, 3000);
        }
         
      });
    }
  );

const cart = document.querySelector('#cart'),
      cartMobile = document.querySelector('#cart-mobile'),
      wishlist = document.querySelector('#wishlist');
const button = document.querySelectorAll('.btn-shop');

    button.forEach((item, i) =>{
        item.addEventListener('click', function(){
          if(item.classList.contains('btn--wishlist')){
            if(item.classList.contains('click-added')){
              let add = Number(wishlist.getAttribute('data-count')|| 0);
              wishlist.setAttribute('data-count', add + 1);
              wishlist.classList.add('zero');
            }else {
              let add = Number(wishlist.getAttribute('data-count')|| 0);
              wishlist.setAttribute('data-count', add - 1);
              wishlist.classList.add('zero');
            }
          } else{
            let add = Number(cart.getAttribute('data-count')|| 0);
            cart.setAttribute('data-count', add + 1);
            cart.classList.add('zero');
          }
        });
      }
    )