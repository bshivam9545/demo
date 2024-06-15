// Filename - component/about.js

import React from "react";
import Container from 'react-bootstrap/Container';
import Cards from '~/container/Cards'

function About() {
    return (
    <Container>
        <Cards title='Shivam' btnTest='Hello' description='description'/>
	</Container>
    );
}
export default About;