import { CartService } from './cart.service';

describe('CartService', () => {
  beforeEach(() => localStorage.removeItem('cart'));
  afterEach(() => localStorage.removeItem('cart'));

  it('conserva un carrito válido', () => {
    const cart = [{ id: 1, name: 'Producto de prueba', quantity: 2 }];
    localStorage.setItem('cart', JSON.stringify(cart));

    expect(new CartService().getCart()).toEqual(cart);
  });

  it('recupera un carrito vacío cuando el JSON está dañado', () => {
    localStorage.setItem('cart', '{invalido');

    const cartService = new CartService();

    expect(cartService.getCart()).toEqual([]);
  });

  it('recupera un carrito vacío si los datos no son un arreglo', () => {
    localStorage.setItem('cart', JSON.stringify({ id: 1 }));

    expect(new CartService().getCart()).toEqual([]);
  });
});
