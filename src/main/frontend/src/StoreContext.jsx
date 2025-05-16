import React, { createContext, useContext, useState } from "react";

const StoreContext = createContext();



export const StoreProvider = ({ children }) => {
  const [cartItems, setCartItems] = useState([]);
  const [wishlistItems, setWishlistItems] = useState([]);

  const addToCart = (product) => {
    const exists = cartItems.find((item) => item.id === product.id);
    if (!exists) {
      setCartItems([...cartItems, product]);
    }
  };

  const removeFromCart = (id) => {
    setCartItems(cartItems.filter((item) => item.id !== id));
  };

  const addToWishlist = (product) => {
    const exists = wishlistItems.find((item) => item.id === product.id);
    if (!exists) {
      setWishlistItems([...wishlistItems, product]);
    }
  };

  const removeFromWishlist = (id) => {
    setWishlistItems(wishlistItems.filter((item) => item.id !== id));
  };

  const clearCart = () => setCartItems([]);

  return (
    <StoreContext.Provider
      value={{
        addToCart,
        removeFromCart,
        addToWishlist,
        removeFromWishlist,
        clearCart,
        setCartItems, // 👈 this is needed for useStore hook
      }}
    >
      {children}
    </StoreContext.Provider>
  );
};

// 👇 Add this custom hook at the bottom of the same file
export const useStore = () => {
  const context = useContext(StoreContext);

  const updateCartItemQuantity = (productId, quantity) => {
    context.setCartItems((prevItems) =>
      prevItems.map((item) =>
        item.id === productId ? { ...item, quantity: quantity } : item
      )
    );
  };

  return {
    ...context,
    updateCartItemQuantity,
  };
};



