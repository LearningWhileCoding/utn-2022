from mundo_pc.dispositivo_entrada import DispositivoEntrada


class Teclado(DispositivoEntrada):

    contador_taclados = 0

    def __init__(self, marca, tipo_entrada):
        Teclado.contador_taclados += 1
        self._id_teclados = Teclado.contador_taclados
        super().__init__(marca, tipo_entrada)

    def __str__(self):
        return f'Id: {self._id_teclados}, Marca: {self._marca}, Tipo Entrada: {self._tipo_entrada}'


if __name__ == '__main__':
    teclado1 = Teclado('Logitech', 'Bluetooth')
    print(teclado1)
    teclado2 = Teclado('Genius', 'Bluetooth')
    print(teclado2)