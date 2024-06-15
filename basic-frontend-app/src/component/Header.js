import Stack from 'react-bootstrap/Stack';
import Container from 'react-bootstrap/Container';
import {
    Link
} from "react-router-dom";
function Header() {
  return (
  <Container>
    <Stack direction="horizontal" gap={5} background="black">
      <div className="p-2"><Link to="/">Home</Link></div>
      <div className="p-2"><Link to="/login">Login</Link></div>
      <div className="p-2"><Link to="/signup">Sign up</Link></div>
      <div className="p-2"><Link to="/"><Link to="/about">About Us</Link></Link></div>
      <div className="p-2"><Link to="/login"><Link to="/contact">Contact Us</Link></Link></div>
    </Stack>
    </Container>
  );
}

export default Header;

