import React, { Component } from "react";
import {
    BrowserRouter as Router,
    Routes,
    Route
} from "react-router-dom";
import Home from "./component/Home";
import About from "./component/About";
import Contact from "./component/Contact";
import Login from "./component/Login";
import Signup from "./component/Signup";
import Header from "./component/Header";
import "./App.css";

class App extends Component {
    render() {
        return (
            <Router>
                <div className="App" with="30%">
                    <Header/>
                    <Routes>
                        <Route
                            path="/"
                            element={<Home />}
                        ></Route>
                        <Route
                            path="/about"
                            element={<About />}
                        ></Route>
                        <Route
                            path="/contact"
                            element={<Contact />}
                        ></Route>
                        <Route
                            path="/login"
                            element={<Login/>}
                        ></Route>
                        <Route
                            path="/signup"
                            element={<Signup/>}
                        ></Route>
                    </Routes>
                </div>
            </Router>
        );
    }
}

export default App;