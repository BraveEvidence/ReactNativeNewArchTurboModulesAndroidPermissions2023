import type {TurboModule} from 'react-native/Libraries/TurboModule/RCTExport';
import {TurboModuleRegistry} from 'react-native';

export interface Spec extends TurboModule {
  askForCameraPermission(): boolean;
}

export default TurboModuleRegistry.get<Spec>('RTNMyPermissions') as Spec | null;
