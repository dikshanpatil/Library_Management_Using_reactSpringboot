import React from 'react';
import './App.css';
import { Navbar } from './Layouts/NavbarAndFooter/Navbar';
import { Footer } from './Layouts/NavbarAndFooter/Footer';
import { Homepage } from './Layouts/Homepage/Homepage';

export const App = () => {
  return (
    <div>
      <Navbar/>
      <Homepage/>
      <Footer/>
    </div>
  );
}
